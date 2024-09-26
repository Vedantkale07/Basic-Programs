import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  studentName: string = '';
  batchNumber: number = 0;
  feedbackText: string = '';
  feedbackEntries: {
    studentName: string;
    batchNumber: number;
    feedbackText: string;
  }[] = [];

  // Method to handle form submission
  onSubmit() {
    // Add the feedback entry to the feedbackEntries array
    const feedbackEntry = {
      studentName: this.studentName,
      batchNumber: this.batchNumber,
      feedbackText: this.feedbackText,
    };
    this.feedbackEntries.push(feedbackEntry);

    // Reset form fields
    this.studentName = '';
    this.batchNumber = 0;
    this.feedbackText = '';
  }
}
