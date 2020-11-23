import { Component, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})

export class AppComponent {
  
  valores = [];

  constructor(private http: HttpClient){}

  ngOnInit(){

    this.http.get("/planeamiento/ventas").toPromise().then(dato =>{
      console.log(dato);

      for(let i in dato)
        if(dato.hasOwnProperty(i))
          this.valores.push(dato[i]);
    })


  }

}
