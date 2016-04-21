package com.company.prog.m2.exceptionURL;

/**
 * Created by Palamarjuk on 18.04.2016.
 */
public class InURL {
    private String url;

    public InURL(String url) {
        this.url = url;
    }

    public String[] splitURL() throws ParamException {
        String[] splitURL = url.split("&");
        for (int i = 0; i < splitURL.length; i++) {
            if ((splitURL[i].indexOf('=')) == -1) {
                throw new ParamException("Invalid a request");
            } else if ((splitURL[i].indexOf('=')) == 0) {
                throw new ParamException("Param not found");
            }else if ((splitURL[i].indexOf('=')) == splitURL[i].length()-1) {
                throw new ParamException("Value not found");
            }
        }
        String[] splitURL1 = url.split("=");
        for (int i = 1; i < splitURL1.length-1; i++) {
            if ((splitURL1[i].indexOf('&')) == -1) {
                throw new ParamException("Invalid a request");
            }else if ((splitURL1[i].indexOf('&')) == 0) {
                throw new ParamException("Invalid a request");
            }else if ((splitURL1[i].indexOf('&')) == splitURL1[i].length()-1) {
                throw new ParamException("Invalid a request");
            }
        }
        return splitURL;
    }

    public static boolean verURL() {

        return true;
    }

    public void tab() throws ParamException {
        String[] splitURL = splitURL();
        System.out.println("-------------------");
        System.out.println("| PARAM  | VALUE  |");
        System.out.println("-------------------");
        for (int i = 0; i < splitURL.length; i++) {
            String[] param = splitURL[i].split("=");
            System.out.println("| " + param[0] + " : " + param[1] + " |");
            System.out.println("-------------------");
        }
    }
}

