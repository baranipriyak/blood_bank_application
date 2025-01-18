import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserBloodRequestComponent } from './user-blood-request.component';

describe('UserBloodRequestComponent', () => {
  let component: UserBloodRequestComponent;
  let fixture: ComponentFixture<UserBloodRequestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UserBloodRequestComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserBloodRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
