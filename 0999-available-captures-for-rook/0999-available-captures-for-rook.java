class Solution {
    public int numRookCaptures(char[][] board) {
        int[] pos=new int[2];
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='R'){
                    pos[0]=i;
                    pos[1]=j;
                    break;
                }
            }
        }
        int count=0;
        for(int i=pos[0];i>=0;i--){
            if(board[i][pos[1]]=='B'){
                break;
            } else if(board[i][pos[1]]=='p'){
                count++;
                break;
            }
        }
        for(int i=pos[1];i>=0;i--){
             if(board[pos[0]][i]=='B'){
                break;
            } else if(board[pos[0]][i]=='p'){
                count++;
                break;
            }
        }
        for(int i=pos[1];i<m;i++){
            if(board[pos[0]][i]=='B'){
                break;
            } else if(board[pos[0]][i]=='p'){
                count++;
                break;
            }
        }
        for(int i=pos[0];i<n;i++){
            if(board[i][pos[1]]=='B'){
                break;
            } else if(board[i][pos[1]]=='p'){
                count++;
                break;
            }
        }
        return count;
    }
}