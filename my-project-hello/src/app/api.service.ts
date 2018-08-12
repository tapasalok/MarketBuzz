import { Injectable } from  '@angular/core';
import { HttpClient} from  '@angular/common/http';
import 'rxjs'
@Injectable({
  providedIn: 'root'
})
export class ApiService {
  constructor(private  httpClient:  HttpClient) { 
    console.log('Hello PeopleServiceProvider Provider');
  }

  load() {
    console.log('=======Calling Service=====');
    // if (this.data) {
    //   // already loaded data
    //   return Promise.resolve(this.data);
    // }
  
    // don't have the data yet
    return new Promise(resolve => {
      // We're using Angular HTTP provider to request the data,
      // then on the response, it'll map the JSON data to a parsed JS object.
      // Next, we process the data and resolve the promise with the new data.
      this.httpClient.get('http://www.gotostock.club/api/messages/')
        .subscribe(data => {
          // we've got back the raw data, now generate the core schedule data
          // and save the data for later reference
          // this.data = data;
          console.log(data);
          resolve(data);
        },
        err => {
            console.log('Some Problem');
            resolve(null);
        }
       );
    });
  }
}
