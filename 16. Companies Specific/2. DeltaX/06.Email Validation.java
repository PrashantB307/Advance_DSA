// Check if Email Address is Valid or not in Java (without using regex)


import java.util.*;
class Main6 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        for(int i = 0; i < n; i++){
            String email = sc.nextLine();

            boolean valid = isValidEmail(email);

            System.out.println(valid);
        }

        sc.close();
    }

    public static boolean isValidEmail(String email) {
    
        if (email == null || email.isEmpty()) {
            return false;
        }

        String[] parts = email.split("@");

        if (parts.length != 2) {
            return false;
        }

        String localPart = parts[0];
        String domainPart = parts[1];

        if (localPart.isEmpty() || domainPart.isEmpty()) {
            return false;
        }

        if (!domainPart.contains(".")) {
            return false;
        }

        if (!isValidLocalPart(localPart) || !isValidDomainPart(domainPart)) {
            return false;
        }

        return true;
    }

    private static boolean isValidLocalPart(String localPart) {
        for (char c : localPart.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '_' && c != '-' && c != '+') {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidDomainPart(String domainPart) {
        for (char c : domainPart.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '-') {
                return false;
            }
        }

        return true;
    } 
}
