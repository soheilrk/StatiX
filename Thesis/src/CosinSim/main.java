package CosinSim;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

import CosinSim.NativeUtils;
import info.exascale.daoc.*;


public class main {
	private static final String Static = null;
	static TreeMap<String, Property> map = new TreeMap<String, Property>();
	static TreeMap<String, InstancePropertiesIsTyped> instanceListPropertiesTreeMap = new TreeMap<String, InstancePropertiesIsTyped>();
	static HashMap<String, Double> WeightsForEachProperty = new HashMap<String, Double>();
	static List<String> listOfInstances = new ArrayList<String>();
	static int noTotalOccurances = 0; 
	static {
	   // System.loadLibrary("info.exascale.daoc");
	  }
	public static void main(String[] args) throws Exception {
		
		FileExits();
//		NativeUtils.loadLibraryFromJar("/resources/daoc.jar");
//		System.out.println("Library Loaded - Loaded from jar");
		
	  }
	//"C:\Users\rosha\OneDrive\Documents\db\museum_redNoBAL"
			//C:\Users\rosha\OneDrive\Documents\db\museum
	public static HashMap<String, Double> PropertyWeights (String file1, String file2) throws IOException
	{
		readDataSet1(file1);
		
		return readDataSet2(file2);
	}
	
	//function to read the first dataset
public static void readDataSet1(String N3DataSet) throws IOException {
	
    FileReader fileReader = new FileReader(N3DataSet);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    //List<String> lines = new ArrayList<String>();
    String line = null;
    int id=-1;
    while ((line = bufferedReader.readLine()) != null) {
        //lines.add(line);
		String[] s = line.split(" ");
		if (s.length<3) continue;
		String instancemapKey = s[0];
		if (!listOfInstances.contains(instancemapKey)) listOfInstances.add(instancemapKey);
		if (s[1].contains("<http://www.w3.org/1999/02/22-rdf-syntax-ns#type>")) 
			{
				InstancePropertiesIsTyped instanceProperties = null;
				if (instanceListPropertiesTreeMap.get(instancemapKey)== null){
					instanceProperties = new InstancePropertiesIsTyped("", true,++id);
				}
				else if (instanceListPropertiesTreeMap.get(instancemapKey)!=null)
				{
					instanceProperties = instanceListPropertiesTreeMap.get(instancemapKey);
					
					instanceProperties.isTyped = true;
				}
				instanceListPropertiesTreeMap.put(instancemapKey,instanceProperties);
				continue;
			}
		
		noTotalOccurances++;
		//insert to the instanceListProperties Treemap
		InstancePropertiesIsTyped instanceProperties = null;
		
		if (instanceListPropertiesTreeMap.get(instancemapKey)== null){
//			int bitId= ++id;
//			int mask = 1 << 31;
//			bitId |= mask;
			instanceProperties = new InstancePropertiesIsTyped(s[1], false,++id);
		}
		else if (instanceListPropertiesTreeMap.get(instancemapKey)!=null)
		{
			instanceProperties = instanceListPropertiesTreeMap.get(instancemapKey);
			
			instanceProperties.propertySet.add(s[1]);
		}
		
		instanceListPropertiesTreeMap.put(instancemapKey,instanceProperties);

		//********************insert to the map Treemap
		String mapkey = s[1];
		//check if the propertyname was in out TreeMap before or not
		if (map.get(mapkey)== null){
			Property entryProperty = new Property(1, mapkey);
			map.put(entryProperty.getKey(),entryProperty);
		}
		else{
			Property value=map.get(mapkey);
			 value.occurances++ ;
			map.put(mapkey,value);
		}    	
    	
		
    }
    bufferedReader.close();
  //setBitid
  		Iterator insIt = instanceListPropertiesTreeMap.entrySet().iterator();
  		
  		while(insIt.hasNext())
  		{
  			int value = 0;
  			
  			Map.Entry<String, InstancePropertiesIsTyped> entry = (Entry<String, InstancePropertiesIsTyped>) insIt.next();
  			if (entry.getValue().isTyped == false)
  			{
  				value= entry.getValue().id;
  				int mask = 1 << 31;
  				value |= mask;
  				entry.getValue().id = value;
  				System.out.println("mask= "+mask);
  				System.out.println("value= "+entry.getKey());

  				System.out.println("value= "+entry.getValue().id);
  			}
  		}
    //return lines.toArray(new String[lines.size()]);
    
	//String[] data = readLines(N3DataSet);
	
	//TreeMap<String, Integer>map = new TreeMap<String, Integer>();

	System.out.println("List Properties for the instance <http://dbpedia.org/resource/Akron_Art_Museum>=  "+instanceListPropertiesTreeMap.get("<http://dbpedia.org/resource/Akron_Art_Museum>").propertySet.size());
//	System.out.println("The TreeMap Including properties and number of accurances in this case for <http://www.w3.org/2002/07/owl#sameAs>= "+map.get("<http://www.w3.org/2002/07/owl#sameAs>").occurances);
//	System.out.println(map.get("<http://dbpedia.org/ontology/abstract>").propertyName);
//	System.out.println(map.size());
	System.out.println("List ids= "+instanceListPropertiesTreeMap.get("<http://dbpedia.org/resource/Akron_Art_Museum>").id);
	
}
	
public static HashMap<String, Double> readDataSet2(String N3DataSet) throws IOException {
	
	//TreeMap key=instanceName and the value= List Of Properties of the key.
	TreeMap<String, List<String>> mapInstanceProperties = new TreeMap<String, List<String>>();
	//TreeMap key=instanceName and the value= number of the types  that instance has
	TreeMap<String, Integer> mapInstanceNoOfTypes = new TreeMap<String, Integer>();
    FileReader fileReader = new FileReader(N3DataSet);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    //List<String> lines = new ArrayList<String>();
	int typeCount = 0;
    String line = null;
    while ((line = bufferedReader.readLine()) != null) {
        //lines.add(line);
//		if (typeCount % 100 ==0)
//				System.out.println(typeCount);
		String[] s = line.split(" ");
		
		if (s.length<3) continue;
		if (s[1].contains("<http://www.w3.org/1999/02/22-rdf-syntax-ns#type>")) typeCount++;
		
		String mapkey = s[0];
		mapInstanceNoOfTypes.put(mapkey, mapInstanceNoOfTypes.get(mapkey)==null?0:(mapInstanceNoOfTypes.get(mapkey)));		

		List<String> lisOfPropertiesPerInstance = new ArrayList<String>();

		if (mapInstanceProperties.get(mapkey)!= null)
			lisOfPropertiesPerInstance=mapInstanceProperties.get(mapkey);

		
		if (s[1].contains("<http://www.w3.org/1999/02/22-rdf-syntax-ns#type>"))
		{
			mapInstanceNoOfTypes.put(mapkey, mapInstanceNoOfTypes.get(mapkey)==null?1:(mapInstanceNoOfTypes.get(mapkey)+1));		
		}
		else if (map.get(s[1])!=null && !lisOfPropertiesPerInstance.contains(s[1]))
		{
			lisOfPropertiesPerInstance.add(s[1]);
		}
		mapInstanceProperties.put(mapkey,lisOfPropertiesPerInstance);
    
    }
    bufferedReader.close();
    //return lines.toArray(new String[lines.size()]);
    
	//String[] data = readLines(N3DataSet);

//	for (String line : data){
//		
//	}
    
//	TreeMap<String, Integer> mapTop5InstanceNoOfTypes = new TreeMap<String, Integer>();
//	
//	for(Map.Entry<String, Integer> entryValue: mapInstanceNoOfTypes.entrySet())
//	{
//		if (mapTop5InstanceNoOfTypes.size()<5)
//			
//			mapTop5InstanceNoOfTypes.put(entryValue.getKey(), entryValue.getValue());
//		
//		else
//		{
//			Map.Entry<String, Integer>  minEntry =mapTop5InstanceNoOfTypes.firstEntry();
//			for(Map.Entry<String, Integer> entry5: mapTop5InstanceNoOfTypes.entrySet())
//			{
//				if(entry5.getValue()<minEntry.getValue())		
//					minEntry = entry5;
//				
//			}
//			
//			if (entryValue.getValue()>minEntry.getValue())
//			{
//				mapTop5InstanceNoOfTypes.remove(minEntry.getKey());
//				
//				mapTop5InstanceNoOfTypes.put(entryValue.getKey(), entryValue.getValue());
//			}	
//			
//		}
//		
//	}
		
//	System.out.println(mapTop5InstanceNoOfTypes);
//	System.out.println("Average Number of Types = "+ typeCount/mapInstanceNoOfTypes.size());
//	System.out.println(mapInstanceNoOfTypes.size());
//	System.out.println(mapInstanceProperties.size());
//	System.out.println(mapInstanceNoOfTypes);
	

    
   // System.out.println("total Number of types in DBpedia = "+typeCount);
//    System.out.println(mapInstanceNoOfTypes.);
	
	//System.out.println(mapInstanceProperties.get("<http://dbpedia.org/resource/Akron_Art_Museum>").size());
	//System.out.println("Number of types for the instance <http://dbpedia.org/resource/BMW_Museum> in DBpedia = "+mapInstanceNoOfTypes.get("<http://dbpedia.org/resource/BMW_Museum>"));
	//System.out.println("List of Properties for the instance <http://dbpedia.org/resource/BMW_Museum> in DBpedia = "+mapInstanceProperties.get("<http://dbpedia.org/resource/BMW_Museum>"));

	
	
	//Third HashMap including the Property namme from the Fist MapTree and totalNumber of types that it in DBpedia***********************************************
	
	HashMap<String, Integer> noTypesPerProperties = new HashMap<String, Integer>(map.size());
	
	int ntypesDBP = 0;
	Iterator mapIt = map.entrySet().iterator();
	
	while(mapIt.hasNext())
	{
		int value = 0;
		
		Map.Entry<String, Property> entry = (Entry<String, Property>) mapIt.next();
		
		// System.out.println(String.format(" ************* Property : %s **************", entry.getValue().key));

		Iterator mapInstPropIt = mapInstanceProperties.entrySet().iterator();
		
		try
		{
			
			while(mapInstPropIt.hasNext())
			{
				Map.Entry<String, List<String>> instPropsEntry = (Entry<String, List<String>>) mapInstPropIt.next();
				
				try
				{
				if (instPropsEntry.getValue()!=null && instPropsEntry.getValue().contains(entry.getKey()))
				{
					int nt = mapInstanceNoOfTypes.get(instPropsEntry.getKey())==null?
							0:
							(mapInstanceNoOfTypes.get(instPropsEntry.getKey())==null?
									0:mapInstanceNoOfTypes.get(instPropsEntry.getKey()));

					value += nt;
					
					//if (nt>0) System.out.println(String.format("%s : %d", instPropsEntry.getKey(), nt));
						
				}
				}
				catch (Exception ex)
				{
				throw ex;
				}
				//mapInstPropIt.remove();
			}
			//System.out.println("" +value) ;
			noTypesPerProperties.put(entry.getKey(), value);
			
			ntypesDBP += value;
			
			//mapIt.remove();
		}
		catch (Exception exeption)
		{
			throw exeption;
		}
	}
	//"C:\Users\rosha\OneDrive\Documents\db\museum_redNoBAL"
		//C:\Users\rosha\OneDrive\Documents\db\museum
	
	mapInstanceProperties.clear();
	mapInstanceNoOfTypes.clear();
	
	//System.out.println("Total number of types that property <http://www.w3.org/2002/07/owl#sameAs> has in DBpedia = "+noTypesPerProperties.get("<http://www.w3.org/2002/07/owl#sameAs>"));
	//System.out.println("Total number of types in DBpedia = " +ntypesDBP);
	//System.out.println("Number of types that property has in DBpedia = "+noTypesPerProperties);
	
	

	//PropertyWeighCalculation*****************************************************************************************************************************
	HashMap<String, Double> weightPerProperty = new HashMap<String, Double>();

	double propertyWeight = 0, totalWeight = 0;
	int foundProps = 0;
	Iterator propIt = map.entrySet().iterator();
	
	ArrayList<String> notFoundProps = new ArrayList<String>();
	ArrayList<Double> properties = new ArrayList<Double>();

	while(propIt.hasNext())
	{
		
		Map.Entry<String, Property> entry = (Entry<String, Property>) propIt.next();

		try
		{
			if(noTypesPerProperties.get(entry.getKey())!=0)
			{
				foundProps++;
				//propertyWeight = ((Math.log(entry.getValue().occurances)/Math.log(2))/(Math.log(noTotalOccurances)/Math.log(2)))/Math.sqrt((Math.log(noTypesPerProperties.get(entry.getKey()))/Math.log(2))/(Math.log(ntypesDBP)/Math.log(2)));
				//propertyWeight = (-(Math.log((entry.getValue().occurances)/(noTotalOccurances+1)))/(Math.log(2)))*(Math.sqrt((noTypesPerProperties.get(entry.getKey()))/(ntypesDBP)));
				double no_type_Propi =noTypesPerProperties.get(entry.getKey());
				double no_occerances_Propi= entry.getValue().occurances;
				propertyWeight = (-(Math.log(no_type_Propi/(ntypesDBP+1)))/(Math.log(2)))*(Math.sqrt(no_occerances_Propi/noTotalOccurances));

				totalWeight += propertyWeight;
				weightPerProperty.put(entry.getKey(), propertyWeight);
				
				properties.add(propertyWeight);
				Collections.sort(properties);
				
			}
			else
			{
				notFoundProps.add(entry.getKey());
			}
			

		}
		catch (Exception exeption)
		{
			throw exeption;
		}
	}
	//Calculating the Median
	double median;
	int middle = properties.size()/2;
	if (properties.size()%2 == 1) {
        median= properties.get(middle);
    } else {
    	median= (properties.get(middle-1) + properties.get(middle)) / 2.0;
    }
	//double averageWeight = totalWeight / foundProps;
	
	for (String prop : notFoundProps) weightPerProperty.put(prop, median);
	
	//calculating the medium of the property weeights 
	System.out.println("Property Weight for <http://www.w3.org/2002/07/owl#sameAs> = " + weightPerProperty.get("<http://www.w3.org/2002/07/owl#sameAs>"));
	//System.out.println("Weight per property has in DBpedia = "+ weightPerProperty);
	
	System.out.println("median: "+median);
//	for (Double propSort : properties) {
//	    System.out.println("Propety: "+propSort);
//	}
	//System.out.println("averageWeight: "+averageWeight);
	properties.clear();
//	 TreeSet<String> propsrk = new  TreeSet<String> ();
//	 ArrayList<Double> propsrklist=new ArrayList<>();
//	 int i=0;
//	propsrk=  instanceListPropertiesTreeMap.get("<http://dbpedia.org/resource/Akron_Art_Museum>").propertySet;
//		System.out.println(propsrk);
//		for (String p : propsrk){
//			propsrklist.add(weightPerProperty.get(p));
//			
//		System.out.println(p+" = "+propsrklist.get(i++));
//		
//		double sum =0;
//		for (i=0; propsrklist.size()>i ; i++){
//			sum += propsrklist.get(i)*propsrklist.get(i);
//		//System.out.println(propsrklist.get(i));
//		}
//		double matio=0;
//		matio= Math.sqrt(sum);
	//	System.out.println("valueeeee"+matio);
		//}
	return weightPerProperty;
	
	//"C:\Users\rosha\OneDrive\Documents\db\museum_redNoBAL"
	//C:\Users\rosha\OneDrive\Documents\db\museum
  
}
	
		
		//*********************************************Calculating Cosin Similarity****************************************************************
//
		 public static double similarity(String instance1, String instance2) throws Exception {

	            double instance1TotalWeight1 = 0;
	            double instance1TotalWeight2 = 0;

	            double powerWeight1=0;
	            double powerWeight2=0;
	            double powerCommon =0;
	    		TreeSet<String> instance1Properties= instanceListPropertiesTreeMap.get(instance1).propertySet;
	    		TreeSet<String> instance2Properties= instanceListPropertiesTreeMap.get(instance2).propertySet;
	    		int sizeListProperty1=instance1Properties.size();
	    		int sizeListProperty2=instance2Properties.size();
	    		ArrayList<Double> powerlist = new ArrayList<Double>();

	    		if (sizeListProperty1>sizeListProperty2)
	    		{
	    			TreeSet<String> tempTreeSet = instance1Properties;
	    			
	    			instance1Properties = instance2Properties;
	    			
	    			instance2Properties = tempTreeSet;
	    			
	    			//tempTreeSet.clear();
	    		}
	    		
	            String lastInstance1Prop;
	            try
	            {
	                if((instance1Properties.isEmpty())&& (instance2Properties.isEmpty()))
	                    return 1;
	                    

	                    for(String prop1: instance1Properties){
	                    	
	                    	double weight = 0;
	                    	if (WeightsForEachProperty.get(prop1)!=null)
	                    		 weight= WeightsForEachProperty.get(prop1);
	            		  
	                    	powerWeight1 += weight*weight;
	            		  
	                    	boolean found = false;
	            		   
	                    	for(String prop2: instance2Properties){

	            			   if (prop2.contains(prop1))
	            			   {
	            				   found = true;
	            				   break;
	            			   }
	            		   }
	                    		   
	            		   if (found) powerCommon += weight*weight;
	                    }
	                    
	                    instance1TotalWeight1 = Math.sqrt(powerWeight1);

	                	   for(String prop2: instance2Properties){
	                		   
	                       	double weight = 0;
	                	    	if (WeightsForEachProperty.get(prop2)!=null)
	                	    		 weight= WeightsForEachProperty.get(prop2);
	                	    	
	                	    		  powerWeight2 += weight*weight;
	                	    }
	                	   instance1TotalWeight2= Math.sqrt(powerWeight2);
	                	//   System.out.print(powerlist);
	                    double similarity = (double) powerCommon / ((double) instance1TotalWeight1*instance1TotalWeight2);

	          	      //  System.out.println("Results: "+instance1+" "+instance2+" "+powerCommon+" /{ "+instance1TotalWeight1+" * "+instance1TotalWeight2+" } ");
	          	      FileWriter fw = new FileWriter("./outputfile.txt", true);
	  	    	    BufferedWriter output = new BufferedWriter(fw);
	  	    	    	output.write( "Results: "+instance1+" "+instance2+" "+powerCommon+" /{ "+instance1TotalWeight1+" * "+instance1TotalWeight2+" } ");
	  	    	    	output.flush();
	  	    	    	
	  	    	    	
	          	        return similarity;
	                    	            	
	            }
	            catch(Exception ex)
	            {
	            	throw ex;
	            }
	            
	            
		 }
		//"C:\Users\rosha\OneDrive\Documents\db\museum_redNoBAL"
			//C:\Users\rosha\OneDrive\Documents\db\museum
	      

	
	public static void Graph() throws Exception
	{
     int n = instanceListPropertiesTreeMap.size();
//     double matrix[][] = new double[n][n];
     Graph gr= new Graph(n);
		gr.addNodes(n);
		InpLinks grInpLinks  = new InpLinks ();
		
		for (int i = 0; i < n; i++)
          {
              for (int j = i; j < n; j++)
              {
            	  
            	  String instance1 = listOfInstances.get(i);
            	  String instance2= listOfInstances.get(j);
	             double  matrix = similarity(instance1, instance2);
	             	               
	               grInpLinks.add(new InpLink(instanceListPropertiesTreeMap.get(instance2).id,matrix));
	               grInpLinks.add(instanceListPropertiesTreeMap.get(instance1).id,grInpLinks);

              }
              gr.addNodeEdges(instanceListPropertiesTreeMap.get(instance1).id,grInpLinks);
              
              
              grInpLinks.clear();
  			
          }
		//clustring and output
		final boolean edges = !gr.directed();

		SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t_t nodes = gr.release();
		SWIGTYPE_p_shared_ptrT_daoc__HierarchyT_std__vectorT_daoc__WeightedLinkT_float_t_t_t_t hier = daoc.cluster(nodes,edges);
		
		

		
		OutputOptions outpopts;
		//outpopts.clsfmt = ClsOutFmt::ROOT;
		outpopts.setClsfmt(ROO
		//outpopts.clsrstep = 0.8;
		outpopts.setClsrstep((float) 0.8);
		//outpopts.clsfile = "rootlev.cnl"
		outpopts.setClsfile("rootlev.cnl");
		//outpopts.fltMembers = true;
		outpopts.setFltMembers(true);
		hier.output(outpopts);

	
	}
	
	//Output Similarity Matrix in a File
//	public static void SymmetricMatrixProgram(String path) throws Exception
//	{
//		FileWriter fw = new FileWriter(path, true);
//	    try (BufferedWriter output = new BufferedWriter(fw)) {
//     int n = instanceListPropertiesTreeMap.size();
//     String ligne = "";
//     double matrix[][] = new double[n][n];
//     
//		for (int i = 0; i < n; i++)
//          {
//              for (int j = i; j < n; j++)
//              {
//            	  
//            	  String instance1 = listOfInstances.get(i);
//            	  String instance2= listOfInstances.get(j);
//               matrix[i][j] = similarity(instance1, instance2);
//            }
//         }
//		for (int i = 0; i < n; i++)
//        {
//            for (int j = i; j < n; j++)
//            {
//          	  
//          	        //System.out.print(matrix[i][j]+","); 
//            	output.write( listOfInstances.get(i)+" "+listOfInstances.get(j)+" = "+matrix[i][j]+"\n"); 
//
//          }
//            System.out.println();
//       }
//		 output.flush();
//	    }
//
//	}

	

	
	//"C:\Users\rosha\OneDrive\Documents\db\museum_redNoBAL"
	//C:\Users\rosha\OneDrive\Documents\db\museum
			
		
		

		//Calculating the Weight of Prperties weight_prop_i = log2(nprop_i) / log2(nprops)   /   (log2(ntypesdbp(prop_i) / log2(ntypesdbp)),
		//
//				double propertyWeight = 0;
//				Set<Map.Entry<String, Integer>> entrySet = noTypesPerProperties.entrySet();
//				for (Entry<String, Integer> propEnty: entrySet){
//					
//					propertyWeight = (Math.log(map.get(propEnty.getKey()).occurances)/Math.log(noTotalOccurances))/(Math.log(noTypesPerProperties.get(propEnty.getKey()))/Math.log(ntypesDBP));
//					
//				}
//				System.out.println(propertyWeight);}

//				double propertyWeight = 0;
//				Set<Map.Entry<String, Property>> entrySet = map.entrySet();
//				for (Entry<String, Property> propEnty: entrySet){
//					
//					propertyWeight = (Math.log(propEnty.getValue().occurances)/Math.log(noTotalOccurances))/(Math.log(noTypesPerProperties.get(propEnty))/Math.log(ntypesDBP));
//					
//				}
//				System.out.println(propertyWeight);

		
	

	
	//Readlines Function is used to read the input file line by line 
		public static String[] readLines(String filename) throws IOException {
		    FileReader fileReader = new FileReader(filename);
		    BufferedReader bufferedReader = new BufferedReader(fileReader);
		    List<String> lines = new ArrayList<String>();
		    String line = null;
		    while ((line = bufferedReader.readLine()) != null) {
		        lines.add(line);
		    }
		    bufferedReader.close();
		    return lines.toArray(new String[lines.size()]);
		}
  
		
		//This function first check if it is out put results from before and will delete them before running the app and then read the directory for input dataset
		public static void FileExits() throws Exception {
		    
			//Reading the N3 Dataset Path
			    		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			    	    System.out.print("Enter the PATH of your First Dataset: ");
			    	        String dataPath = br.readLine();    	
			    	readDataSet1(dataPath);
			    	 BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			    	    System.out.print("Enter the PATH of your Second Dataset: ");
			    	        String dataPath2 = br2.readLine(); 
			    	        WeightsForEachProperty = readDataSet2(dataPath2);
			    	   //   SymmetricMatrixProgram();
			    	
			    }
		
		
		
//		public static void CreateGraph() throws Exception {
//			
			
			
			
//			
//		}
//		
		
}
