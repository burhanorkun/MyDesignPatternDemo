package com.orkun.template;

import com.orkun.template.exercise.ChatWindow;
import com.orkun.template.exercise.Window;

public class Main {

    public static void main(String[] args) {
        // Transfer Money
        Task task = new TransferMoneyTask();
        task.execute();
        // Generate Report
        task = new GenerateReportTask();
        task.execute();
        // ..

        Window window = new ChatWindow();
        window.close();
    }
}
