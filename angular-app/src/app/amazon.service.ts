import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AmazonService {

  readonly API_URL = "http://localhost:8080";

  readonly ENDPOINT_ITEMS = "/items"

  constructor(private httpClient: HttpClient) { }

  getItems() {
    return this.httpClient.get(this.API_URL+this.ENDPOINT_ITEMS)
  }
}