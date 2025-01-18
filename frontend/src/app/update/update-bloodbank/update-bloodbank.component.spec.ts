import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateBloodbankComponent } from './update-bloodbank.component';

describe('UpdateBloodbankComponent', () => {
  let component: UpdateBloodbankComponent;
  let fixture: ComponentFixture<UpdateBloodbankComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UpdateBloodbankComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateBloodbankComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
