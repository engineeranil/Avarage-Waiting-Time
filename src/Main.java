public class Main {
    public static void main(String[] args) {
        int[][] customers = {{ 1,2},{2,5},{4,3}};
        int currentTime = 0;
        int totalWaitTime = 0;
        int lengthCustomer = customers.length;
        for(int i =0; i<customers.length; i++){
            int arrivalTime = customers[i][0];
            int prepareTime = customers[i][1];
            if(currentTime<arrivalTime){
                currentTime = arrivalTime;
            }
            totalWaitTime += currentTime+prepareTime-arrivalTime;
            currentTime+=prepareTime;
        }
        double avarageWaitTime = totalWaitTime/lengthCustomer;
        System.out.println(avarageWaitTime);
        //***********************************************
        //SECOND SOLUTION
       /* int[][] customers = {{2,3},{6,3},{7,5},{11,3},{15,2},{18,1}};
        int prepareTime=0;
        double waitingTime =0;
       int lengthCustomers = customers.length;
        for(int i =0; i<customers.length; i++){
          for(int j=0; j<customers[0].length; j++){
              if(i==0){
                  prepareTime+=customers[i][j]; // 3
              }
               if(i!=0 && j<=0 && prepareTime>customers[i][0]){
                   prepareTime+=customers[i][1]; //8 //11
               }
               if(prepareTime<customers[i][0]){
                prepareTime=(customers[i][j]+customers[i][1]);
               }
          }
            if(prepareTime<customers[i][0]){
                customers[i][1]+=customers[i][0];
                waitingTime+=customers[i][1]-customers[i][0];
               break;
            }
            waitingTime+=(prepareTime-customers[i][0]);
        }
        System.out.println(waitingTime/lengthCustomers);*/

    }
}
