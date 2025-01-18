import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddNewBloodbankComponent } from './add-new-bloodbank.component';

describe('AddNewBloodbankComponent', () => {
  let component: AddNewBloodbankComponent;
  let fixture: ComponentFixture<AddNewBloodbankComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AddNewBloodbankComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddNewBloodbankComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
