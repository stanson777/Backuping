public class Osoba {

    public static String correct_names(String surname){
        char[] new_surname=new char[surname.length()];
        for(int i=0;i<=surname.length()-1;i++){
            if(i==0){
                new_surname[i]=Character.toUpperCase(surname.charAt(i));
            }else{
                new_surname[i]=Character.toLowerCase(surname.charAt(i));
            }
        }
        String nazwisko="";
        for(char znak:new_surname){
            nazwisko+=znak;
        }
        return nazwisko;
    }

    public static String name_surname(String name,String surname){
        String inicjaly="";
        inicjaly+=surname.toUpperCase();
        inicjaly+=" ";
        inicjaly+=correct_names(name);
        return inicjaly;
    }

    public static String initials(String name,String surname){
        String inicjaly="";
        inicjaly+=Character.toUpperCase(name.charAt(0));
        inicjaly+=Character.toUpperCase(surname.charAt(0));
        return inicjaly;
    }
    public static String login(String name,String surname){
        String login="";
        for(int i=0;i<=1;i++){
            login+=Character.toUpperCase(surname.charAt(i));
        }
        for(int i=0;i<=2;i++){
            login+=Character.toLowerCase(name.charAt(i));
        }

        return login;
    }
    public static void main(String[] args){

        String imie=args[0];
        String nazwisko=args[1];

        System.out.println("Nazwisko: "+correct_names(nazwisko));

        System.out.println("Imie: "+correct_names(imie));

        System.out.println("Nazwisko i imię: "+name_surname(imie,nazwisko));

        System.out.println("Inicjały: "+initials(imie,nazwisko));

        System.out.println("Login: "+login(imie,nazwisko));
    }
}
