public class Main {
    public static void main(String[] args) {



   //Task#1
        {int a;
        byte b;
        short c;
        long d;
        float e;
        double f;

        //Task#2
        a = 27897;
         b = 67;
         c = 569;
        d = 987678965549L;
         e = 27.12f;
         f = 2.786; }

//Task#3
    byte g = 23;
    byte h = 27;
    byte i = 30;
    short j = 480;
    byte x = (byte) (j / (g+h+i));

    { System.out.println("На каждого ученика рассчитано " + x +" листов бумаги" );}





//Task#4
    { byte k = 16;
   int l = k * 10;
    int m = k * 12;
    int n = k * 36;
    int o = k * 360;
{ System.out.println("За 20 минут машина произвела " + l + " штук бутылок");}
        { System.out.println("За 20 минут машина произвела " + m +" штук бутылок");}
            { System.out.println("За 20 минут машина произвела " + n + " штук бутылок");}
                { System.out.println("За 20 минут машина произвела " + o + " штук бутылок");}}




//Task#5
{
byte all = 120;
byte p = 2;
byte q = 4;
byte r = (byte) (all/(p+q));
byte s = (byte) (r*p);
byte t = (byte) (r*q);
    { System.out.println("В школе, где " +r+" классов, нужно " + s + " банок белой краски и "+ t + " банок коричневой краски");}}

//Taks#6
{int banana = 5*80;
int milk = 2*105;
int ice = 2*100;
int egg = 4*70;
int kg = 1000;
int result1 = (banana + milk + ice + egg);
float result2 = (result1 / (float) kg);
{ System.out.println("Вес такого спортзавтрака равен " + result1 + " грамм и " + result2 + " килограмм");}}


//Taks#7

{byte v = 7000 / 250;
    byte y = 7000 / 500;
    byte c = 7000 / 375;
    { System.out.println( "Если терять в день по 250 грамм, то понадобится " + v + " дней. Если терять по 500 грамм в день,  то понадобится " + y + " в среднем понадобится " + c + " дней");}}


//Task#8

{float increase = 0.1f;
int m = 67760;
int d = 83690;
int k = 76230;
byte t = 12;
int resultm = (int) (m * increase) + m;
int resultd = (int) (d * increase) + d;
int resultk = (int) (k * increase) + k;
int yearm = (resultm * t) - (m * t);
int yeard = (resultd * 12) - (d * 12);
int yeark = (resultk * 12) - (k * 12);

{ System.out.println( "После повышени зарплаты Маша будет получать " + resultm + ", Денис " + resultd + " а Кристина " + resultk + " рублей в месяц.");}
{ System.out.println( "Разница между годовым доходом у Маши составила " + yearm + " у Дениса " + yeard + " а Кристины " + yeark + " рублей ");}}}}
