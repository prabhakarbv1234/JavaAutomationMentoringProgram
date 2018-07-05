//1. News is displayed on 10 per page. Write a method that determines the number of pages for outputting N news.
public class TaskNews {
public static void main(String[] args) {
              // TODO Auto-generated method stub
              int news = 151;
              int page;
              if(news%2 == 0){
                     page = news/10;
              }else{
                     page = (news/10)+1;
              }
              System.out.println("Total number of Pages: "+page);
       }
}
