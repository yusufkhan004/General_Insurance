import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {


  constructor(private router:Router) { }

  ngOnInit(): void {}

  goToPage(pageName: string):void {
    // this.router.navigate([`${pageName}`]);
    window.open(pageName, "_blank");
  }

}
