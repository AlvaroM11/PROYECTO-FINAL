import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import{RegistroMovilComponent}, from '../RegistroMovilComponent'


describe('RegistroMovilComponent', () => {
  let component: RegistroMovilComponent;
  let fixture: ComponentFixture<RegistroMovilComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RegistroMovilComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistroMovilComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
