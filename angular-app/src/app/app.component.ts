import { Component } from '@angular/core';

import { AmazonService } from './amazon.service';

import { OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [ AmazonService ]
})
export class AppComponent implements OnInit {
  title = 'angular-app';
  items: Object;

  constructor(private amazonService: AmazonService) { }

  ngOnInit() {
      console.log('test');
      this.amazonService.getItems().subscribe((datas) => {
        this.items = datas;
      })
  }
}
