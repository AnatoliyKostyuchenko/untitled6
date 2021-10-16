package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class Main {

    public static void main(String[] args){

    internetService();
    }
    public static void internetService(){
        int x = openConnection "https://openexchangerates.org/api/latest.json  ?app_id=YOUR_APP_ID  &base=GBP  &callback=someCallbackFunction currencies.json  historical/2021-10-17.json-"
        openConnection "https://openexchangerates.org/api/latest.json  ?app_id=YOUR_APP_ID  &base=GBP  &callback=someCallbackFunction currencies.json  historical/2021-10-16.json"";
        if(x>0){
      return   openConnection "api.giphy.com/v1/gifs/trending  YOUR_API_KEY=30 random_id=e826c9fc5c929e0d6c6d423841a282aa"
        }
        else{
        return    openConnection "api.giphy.com/v2/gifs/trending  YOUR_API_KEY=30 random_id=e826c9fc5c929e0d6c6d423841a282aa"
        }
    }
}
