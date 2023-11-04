package com.lifepod.co;

public class EncryptIt {
    private String key = "nopqrstuvwxyzabcdefghijklm ";
    public String message;

    public EncryptIt(String message){
        this.message = message;
    }

    private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
            'o','p','q','r','s','t','u','v','w','x','y','z',' '};

    private char[] keyArray = key.toCharArray();

    public void encrypt() {
        //populate array with encryption characters
        for (int i=0; i<alphabet.length; i++){
            alphabet[i] = key.charAt(i);
            System.out.println(alphabet[i]);
        }

    }

    public String decrypt (String encrypt) {
        return encrypt;
    }

}
