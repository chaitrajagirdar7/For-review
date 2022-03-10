package sms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SendSms {

	public static void smsCustomer(String double1){
    try {
        // Construct data
        String apiKey = "apikey=" + "MzE1OTc3Mzg3NDZmN2E2MzRhN2E1NTU3NTc1NDQ4NzA=";
        String message = "&message=" + double1;
        String sender = "&sender=" + "1107161517879065578";
        String numbers = "&numbers=" + "919632853095";

        // Send data
        HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
        String data = apiKey + numbers + message + sender;
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
        conn.getOutputStream().write(data.getBytes("UTF-8"));
         
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line = rd.readLine()) != null) {
            stringBuffer.append(line).append("\n");
        }
        System.out.println(stringBuffer.toString());
        rd.close();


    } catch (Exception e) {
       e.printStackTrace();
    }
}}