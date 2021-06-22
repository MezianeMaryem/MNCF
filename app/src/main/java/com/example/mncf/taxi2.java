package com.example.mncf;

public class taxi2{
    String name,num,arrive,depart,date,heure;
    public taxi2() {}
        public taxi2(String name,String num,String arrive,String depart, String date,String heure){
                this.arrive = arrive;
                this.name=name;
                this.date=date;
                this.depart=depart;
                this.heure=heure;
                this.num=num;
        }

        public String getName(){
        return name;
        }
        public void setName(){
        this.name=name;
        }

        public String getNum(){
        return num;
        }
    public void setNum(){
        this.num=num;
    }

        public String getDate(){
        return date;
         }
    public void setDate(){
        this.date=date;
    }

    public String getHeure(){
        return heure;
    }
    public void setHeure(){
        this.heure=heure;
    }

    public String getDepart(){
        return depart;
    }
    public void setDepart(){
        this.depart=depart;
    }

    public String getArrive(){
        return arrive;
    }
    public void setArrive(){
        this.arrive=arrive;
    }
}

