export interface CatFactsState {
  data: CatFact[];
  error: any;
  isLoading: boolean;
}

export interface CatFact {
  id: string;
  fact: string;
}

export interface CatFactsResponseData {
  fact: string;
  length: number;
}
