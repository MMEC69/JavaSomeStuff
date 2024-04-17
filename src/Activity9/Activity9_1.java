package Activity9;

public class Activity9_1 {
    public static void main(String args[]){
        Bob d = new Bob();
        d.Study();
        d.Play();
    }
}

class Student{
    void Play(){
        System.out.println("Playing Football......");
    }
}

class Bob extends Student{
    void Study(){
        System.out.println("Studing Physic......");
    }
}


