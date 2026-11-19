class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        
        boolean[] vst =  new boolean[rooms.size()];
        vst[0] = true;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        while(!st.isEmpty()){
            int node = st.pop();
            for(int ngh : rooms.get(node)){
                if(!vst[ngh]) {
                    vst[ngh] = true;
                    st.push(ngh);

                }
            }
        }
            for(boolean v : vst) if(!v ) return false;
               return true;

           
        }
      
    }
