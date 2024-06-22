int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b; // Calculate each term based on the formula given
                System.out.print(sum + " "); // Print each term followed by a space
            }
            System.out.println(); // Move to the next line after printing the series for each test case
        }
