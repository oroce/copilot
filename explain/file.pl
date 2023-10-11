# source: https://www.perlmonks.org/?node_id=442491
@array[-$i,$j] = @array[$j,-$i] while $j = rand(@array - $i), ++$i < @array;

# can you make this more readable?
# how would you do this in java?