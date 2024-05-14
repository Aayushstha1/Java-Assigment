class Student {
    public static void main(String[] args) {
        int score=75;
        Student st = new Student();
        st.modifyStudent(score);
        System.out.println("The orginal student score : "+score);
       }
       void modifyStudent(int i){
        i=i+10;
        System.out.println("The modified Student score"+1);
       }
    
}
