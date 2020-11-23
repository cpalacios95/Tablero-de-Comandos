import { Component, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})

export class AppComponent {
  title = '';
  constructor(private http: HttpClient){}

  ngOnInit(){

    this.http.get("/planeamiento/ventas", {responseType: 'text'}).subscribe(
      (resp: any) =>{
        this.title=resp;
      }
    )
  }
}
