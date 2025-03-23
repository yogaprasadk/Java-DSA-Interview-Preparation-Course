package packages;

import static packages.Message.message;

public class greeting {
    public static void main(String[] args) {
        System.out.println("hello");
        // this message function is called from another file
        // we can able to pass like this using import method.
        // when you import the function from another file,the methods/functions  need to be static.
        message();
    }

    // packages are stored in hierarchical manner
    // packages is just a folder
    // class with a same name cannot be stored in a same package but can be stored in different folder
    // you need to mention the package name.in the java file.
    // mentioning the package name as per declared in your file system.
}

/*
hierarchical manner means stored folder inside the folder
 */

//how does java know to look the file for packages? - Answer:  using  Access modifier or Access Specifier and import method.