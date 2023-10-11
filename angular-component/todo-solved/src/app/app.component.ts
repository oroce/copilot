import { Component } from '@angular/core';
import { Item } from './item';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  title = 'todo';

  filter: 'all' | 'active' | 'done' = 'all';

  allItems = [
    { description: 'Get to work', done: false },
    { description: 'Pick up groceries', done: false },
    { description: 'Go home', done: false },
    { description: 'Fall asleep', done: false }
  ];

  get items() {
    if (this.filter === 'all') {
      return this.allItems;
    } else if (this.filter === 'active') {
      return this.allItems.filter(item => !item.done);
    } else if (this.filter === 'done') {
      return this.allItems.filter(item => item.done);
    }
    return [];
  }

  addItem(description: string) {
    this.allItems.unshift({ description, done: false})
  }
  remove(item: Item) {
    const index = this.allItems.indexOf(item);
    this.allItems.splice(index, 1);
  }
}
