class Solution {
     public double[] calcEquation(
        List<List<String>> equations, 
        double[] values, 
        List<List<String>> queries) {

            Map<String, Map<String, Double>> graph = new HashMap<>();

            for(int i = 0; i < equations.size() ; i++){
                String a = equations.get(i).get(0);
                String b = equations.get(i).get(1);
                double v = values[i];

                graph.putIfAbsent(a, new HashMap<>());
                graph.putIfAbsent(b, new HashMap<>());
                graph.get(a).put(b, v);
                graph.get(b).put(a, 1/v);

            }

            double[] result = new double[queries.size()];

            for(int i = 0; i < queries.size() ; i++){

                String s = queries.get(i).get(0);
                String t = queries.get(i).get(1);

                if(!graph.containsKey(s) || !graph.containsKey(t)){
                    result[i] = -1.0;
                }else{
                    result[i] = dfs(s, t, graph, new HashSet<>(), 1.0);
                }
                
            }


        return result;
    }

    private double dfs(String s, String t, 
        Map<String, Map<String, Double>> graph, 
        HashSet<String> visited, 
        Double product){

            if(s.equals(t)){
                return product;
            }

            visited.add(s);

            for(Map.Entry<String, Double> temp : graph.get(s).entrySet()){
                String n = temp.getKey();
                Double value = temp.getValue();

                if(!visited.contains(n)){

                    double result = dfs(n, t, graph, visited, product * value);
                    if (result != -1.0) {
                        return result;
                    }
                    
                }

                

            }

            return -1.0;
        }
}