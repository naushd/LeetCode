class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {


        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0 ; i < numCourses ; i++){

            graph.add(new ArrayList<>());

        }

        for(int[] pre : prerequisites){
            int course = pre[0];
            int p = pre[1];
            graph.get(p).add(course);
        }

        int[] state = new int[numCourses];

        for(int course = 0 ; course < numCourses ; course++){

            if(!dfs(course, graph, state)){
                return false; 
            }

        }

        return true;
        
    }

    // Using DSF cycle check 

    private boolean dfs(int course, List<List<Integer>> graph, int[] state ){

        if(state[course] == 1){
            return false;
        }

        if(state[course] == 2){
            return true;
        }

        state[course] = 1; 

        for(int neighbour : graph.get(course)){

            if(!dfs(neighbour, graph, state)){
                return false;
            }

        }

        state[course] = 2;
        
        return true;
    }
}