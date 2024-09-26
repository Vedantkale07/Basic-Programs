import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username: any='';
  password: any='';

  xyz(myForm:any){
    console.log(myForm.value);

    alert("One way data Binding ");
  }

  abc(){
    console.log(this.username);
    console.log(this.password);
    alert("2 way Binding ")
  }

}
