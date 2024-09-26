import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  limit: number = 1;        // The maximum number for which the tables will be generated
  tables: { number: number, data: number[] }[] = [];  // Array to store all tables

  // Method to generate tables for numbers from 1 up to 'limit'
  generateTables(): void {
    this.tables = [];  // Reset tables array
    for (let i = 1; i <= this.limit; i++) {
      const tableData = [];
      for (let j = 1; j <= 10; j++) {  // Generate up to 10 multiples by default
        tableData.push(j);
      }
      this.tables.push({ number: i, data: tableData });
    }
  }
}


