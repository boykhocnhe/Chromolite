/**
 *  Chromolite Simulation Component Specifications
 *  Copyright (c) 2018
 *
 *  Last Updated: 23/04/2018
 *  Author: Riley Blair - https://github.com/Riley-Blair
 */

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SimulationComponent } from './simulation.component';

describe('SimulationComponent', () => {
    let component: SimulationComponent;
    let fixture: ComponentFixture<SimulationComponent>;

    beforeEach(async(() => {
        TestBed.configureTestingModule({
            declarations: [ SimulationComponent ]
        })
        .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(SimulationComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
    });
});
