class Multiple{
    public static void main(String[] args) {
        int num = 25;

        //Useing while loop to print multiple of 5 in reverse order
        while (num >= 5){
            if(num%5==0){
                System.out.println(num);
            }
            num--;
        }

    }
}