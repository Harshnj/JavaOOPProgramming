//This Code gives an error as this code is to understand more about static usage  
//We cant have two methods one static and other non having same name and same arguments or parameter in class
//As when we try to access method using object name the java gets confused which one to call and gives error

class A{
    void print(){

    }

    static void print( ){

    }
}
