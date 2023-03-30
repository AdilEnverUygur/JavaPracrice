package com.bughra.java.day09;

/*
* Considering that there is a 2-dimensional array of purchase order,
* in which every row has 4 elements representing ID, item, quantity, and unite price.
* An example is shown in the following code. Please write a code fragment that takes this array as input and
* generates a HTML table showing details with total price of each item, as well as the purchase order total price,
* like shown in the following expected result.
    Example Code of Input Data:
    var data = [
                   ["A001", "Pen", 5, 20]
                   ["A002", "Book", 3, 45]
                   ["A003", "Paper", 17, 30]
                   ]
Expected Result:
ID         Item                 Quantity              Unit Price           Total Price
A001       Pen                   5                        20                      100
A002       Book                  3                        45                      135
A003       Paper                17                        30                      510
                                          Purchase Order Total Price              745
*/
public class TwoDimensionalArray {
    public static String generateHTMLTable(String[][] data){
        //Create the opining tag for the table
        String htmlTable = "<table>\n";

        //Add the header row
        htmlTable += "<tr><th>ID</th><th>Item</th><th>Quantity</th><th>Unit Price</th><th>Total Price</th></tr>\n";

        // Initialize the total price to zero
        int totalPrice = 0;

        // Loop through each row of data and generate a table row
        for (int i = 0;i < data.length; i++) {
            // Extract the values from the current row
            String id = data[i][0];
            String item = data[i][1];
            int quantity = Integer.parseInt(data[i][2]);
            int unitPrice = Integer.parseInt(data[i][3]);
            int totalItemPrice = quantity * unitPrice;

            // Add a new row to the table with the values from the current row of data
            htmlTable += "<tr><td>" + id + "</td><td>" + item + "</td><td>" + quantity + "</td><td>" + unitPrice + "</td><td>" + totalItemPrice + "</td></tr>\n";

            // Add the total price for this item to the overall purchase order total
            totalPrice += totalItemPrice;
        }

            // Add the purchase order total row
            htmlTable += "<tr><td colspan=\"4\">Purchase Order Total Price</td><td>" + totalPrice + "</td></tr>\n";

            // Add the closing tag for the table
            htmlTable += "</table>";

            // Return the completed HTML table string
            return htmlTable;

    }

    public static void main(String[] args) {
        String[][] data = {
                {"A001", "Pen", "5", "20"},
                {"A002", "Book", "3", "45"},
                {"A003", "Paper", "17", "30"}
        };

        String htmlTable = generateHTMLTable(data);

        System.out.println(htmlTable);
    }
}
