import { Component, OnInit } from '@angular/core';
import { ApiService } from  '../api.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  private  contacts:  Array<object> = [];
  public peoples: any;
  constructor(private  apiService:  ApiService) { }

  ngOnInit() {
    this.loadPeople();
  }

  loadPeople(){
    this.apiService.load()
    .then(data => {
      this.peoples = data;
    });
  }

}
