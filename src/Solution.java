

import globalPayment.PreferTeam;

import java.io.*;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter((System.getenv("OUTPUT_PATH"))));
        String skills = bufferedReader.readLine();
        int result =  PreferTeam.differentTeams(skills);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}