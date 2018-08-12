import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-picture',
  templateUrl: './picture.component.html',
  styleUrls: ['./picture.component.css']
})
export class PictureComponent implements OnInit {
  description = 'This is a nice movie';
  searchMovie:any = 'Any';

  url = 'http://photo.elcinema.com.s3.amazonaws.com/uploads/_315x420_c751f6639f1bfdbde98710532d5046686987434dcc483b8cb09d75464f4a0f32.jpg';

  movie = {
    url : "http://photo.elcinema.com.s3.amazonaws.com/uploads/_315x420_c751f6639f1bfdbde98710532d5046686987434dcc483b8cb09d75464f4a0f32.jpg"
  };

  constructor() { 
    
  }

  ngOnInit() {
  }

  
  
  buyTicket(){
    alert('Buying Ticket');
  }
  
  valueChange(value){
   console.log("===="+value);
  }
}

