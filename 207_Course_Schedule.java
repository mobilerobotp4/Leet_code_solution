/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.

Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

 

Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take. 
             To take course 1 you should have finished course 0. So it is possible.
Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
             To take course 1 you should have finished course 0, and to take course 0 you should
             also have finished course 1. So it is impossible.
 

Constraints:

The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.
You may assume that there are no duplicate edges in the input prerequisites.
1 <= numCourses <= 10^5


*/

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses <= 0 )
            return false;
        //build the course graph
        Map<Integer,List<Integer>> graph = buildGraph(prerequisites);        
        Map<Integer,Integer> courseStatus = new HashMap(); 
        //first complete the courses with no pre requisites
        finishIndependentCourses(numCourses,prerequisites,graph,courseStatus);
        //check if rest of the courses can be finished
        for(int i = 0; i < numCourses; i++){
            if(!canFinish(i, graph, courseStatus)){
                return false;
            }
        }
        return true;
    }
    private boolean canFinish(int course, Map<Integer,List<Integer>> graph, Map<Integer,Integer> courseStatus){
        if(courseStatus.get(course) == 2)
            return true;
        if(courseStatus.get(course) == 1)
            return false;
        courseStatus.put(course,1);        
        List<Integer> requiredCourses = graph.get(course);
        for(int requiredCourse : requiredCourses){
            if(!canFinish(requiredCourse, graph, courseStatus)){
                return false;
            }
        }        
        courseStatus.put(course,2);
        return true;
    }
    private void finishIndependentCourses(int numCourses, int[][] prerequisites,Map<Integer,List<Integer>> graph, Map<Integer,Integer> courseStatus){
	// course status : 0 - not taken, 1 - In progress, 2 - completed
        for(int i = 0; i < numCourses; i++){
            if(graph.get(i) != null)
                courseStatus.put(i,0);
            else
                courseStatus.put(i,2);
        }
    }
    private Map<Integer,List<Integer>> buildGraph(int[][] preReqs){
        Map<Integer,List<Integer>> graph = new HashMap();
        for(int[] preReq : preReqs){
            int currCourse = preReq[0];
            int reqCourse = preReq[1];
            if(!graph.containsKey(currCourse)){
                graph.put(currCourse,new ArrayList());
            }
            graph.get(currCourse).add(reqCourse);
        }
        return graph;
        
    }
}
