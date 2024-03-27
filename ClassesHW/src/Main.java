public class Main extends Car {

    public Main(String m, int s, String c) {
        super(m , s , c);
    }

    public static void main(String[] aargs) {
        Car Dodge = new Car("Challenger",320,"USA");
        Car Tesla = new Car("Solaid",300,"USA");
        System.out.print(Dodge.getMxspd()+" "+ Tesla.getMxspd());
        Dodge.calculte();
        Tesla.calculte();
        Dodge.all();
    }
}

    class Car {
        private String model;
         private int mxspd;
        private String Country;
        public Car (String m, int s,String c){
            this.model = m;
            this.mxspd = s;
            this.Country = c;
        }
        double calculte(){
            double res = mxspd * 0.3;
            System.out.println(" "+res+" ");
            return res;
        }
        void all (){
            java.lang.String all = model +" "+ Country;
            int ss = mxspd;
            System.out.println(all+" "+ ss);
        }
        String getModel(){return this.model;}
        int getMxspd(){return this.mxspd;}
        String getCountry(){return this.Country;}

        void setModel(String model){ this.model = model;}
        void setMxspd(int mxspd){ this.mxspd = mxspd;}
        void setCountry(String Country) { this.Country = Country;}




    }



