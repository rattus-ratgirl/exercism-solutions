type candidate = int

let rec pow base exp =
  if exp = 0 then 1
  else base * pow base (exp - 1)

let validate (n : candidate) : bool = 
  let digits =
    string_of_int n 
    |> String.to_seq
    |> Seq.map (fun c -> Char.code c - Char.code '0')
    |> List.of_seq
  in
  let len = List.length digits in
  let sum = List.fold_left (fun acc d -> acc + pow d len) 0 digits in
  sum = n