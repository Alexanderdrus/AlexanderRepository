package Lesson5;

public class Domashka5a {
    public static void main(String[] args) {
        Sotrudnik[] sotrudniks= new Sotrudnik[5];
        sotrudniks[0]=new Sotrudnik("Alexander Dmitriev","Slesar MSR","Alex@mail.ru",89122234334l,40000,28);
        sotrudniks[1]=new Sotrudnik("Alexander Bikov","Slesar MSR","Bikov21121@mail.ru",89223212345l,50000,42);
        sotrudniks[2]=new Sotrudnik("Marina Vasilieva","Montaznik","Marina@mail.ru",89163458345l,34000,47);
        sotrudniks[3]=new Sotrudnik("Petr Mihailov","Constructor","psih@mail.ru",89223212345l,55000,54);
        sotrudniks[4]=new Sotrudnik("Sergey Dolgov","Slesar","Serg@mail.ru",89222123324l,46000,31);

        sotrudniks[0].info();
        System.out.println();

        for (int i = 0; i < sotrudniks.length; i++) {
            if (sotrudniks[i].getAge()>40){
                sotrudniks[i].info();
            }
        }

        }

    }



