import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidation } from './custom.validation';


@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {
  get email() {
    return this.form.get('email');
  }
  get password() {
    return  this.form.get('password');
  }

  get imgUrl() {
    return this.form.get('imgUrl');
  }

  get description() {
    return this.form.get('description');
  }

  form = new FormGroup({
    email : new FormControl('' , [Validators.required ]),
    password : new FormControl('' , [Validators.required ]),
    imgUrl : new FormControl('', [Validators.required ]),
    description : new FormControl('', [Validators.required])
  });

  constructor() { }

  ngOnInit() {
  }
  loginData(form) {
    console.log(form);
  }

}
