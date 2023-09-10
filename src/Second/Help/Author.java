package Second.Help;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public char getGender(){
        return this.gender;
    }
    @Override
    public String toString(){
        return this.name + " " + this.email + " " + this.gender;
    }
}


