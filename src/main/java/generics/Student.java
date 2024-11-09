package generics;

public class Student<T> {

    T id;
    T email;

    public Student(T id, T email) {
        this.id = id;
        this.email = email;
    }
}


