import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListOfBloodbanksComponent } from './list-of-bloodbanks.component';

describe('ListOfBloodbanksComponent', () => {
  let component: ListOfBloodbanksComponent;
  let fixture: ComponentFixture<ListOfBloodbanksComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListOfBloodbanksComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListOfBloodbanksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
