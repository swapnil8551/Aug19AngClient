import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { DataService } from '../data.service';

@Component({
  selector: 'app-admin-customer-policy-details',
  templateUrl: './admin-customer-policy-details.component.html',
  styleUrls: ['./admin-customer-policy-details.component.css']
})
export class AdminCustomerPolicyDetailsComponent implements OnInit {

  AllCustPolicyData:any
  msg:string
  constructor(private DataService:DataService,private AuthService:AuthService, private router:Router) { 
    if(sessionStorage.roleID!=0)
    {
      delete sessionStorage["email"];
    delete sessionStorage["userid"];
    delete sessionStorage["roleID"];
    delete sessionStorage["userdata"];
    delete sessionStorage["isLoggedIn"];
    this.router.navigate(['Login']);
     

    }
  }

  ngOnInit() {

    let resultstate:any = this.DataService.GetAllUsersPolicyData()
      // console.log(PolicyData.form.value)
      resultstate.subscribe((data: any) => {
        // if (data.error == null) {
          // this.msg = "Successfully Added Up!!";
          console.log(data)
         this.AllCustPolicyData=data
        // }
        // else {
        //   // console.log(data);
        //   // this.msg = "Somthing went Wrong!!";
        //   // this.num = 0;
        // }
      },(error)=>{
        console.log(error);
          // this.msg = "Somthing went Wrong!!";
          
      });
    
  }
}
