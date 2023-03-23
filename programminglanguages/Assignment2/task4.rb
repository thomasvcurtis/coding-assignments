#Author: Thomas Curtis
#Discription: Updates the contructor to accomodate the creation of a tree using a Hash and displayes the number of leaves

class Tree
    attr_accessor :children, :node_name

    @@leaves = 0
    @@nodes=0

    def initialize(tree)
      hash = tree.values[0] #temporary hash
      
      @@nodes += 1

      @node_name = tree.keys[0]
      @children = hash.map{ |k,v| Tree.new(k => v) }

      if hash.empty?()
        @@leaves += 1
      end

    end

    def visit_all(&block)
      visit &block
      children.each {|c| c.visit_all &block}

    end
    
    def visit(&block)
      block.call self
    end

    def leaves
      p @@leaves
    end

end

ruby_tree = Tree.new( {
  'ggp' => {
            'gp1' => {  'p1'  => { 'child1' => { } , 'child2' => { } } ,
                        'p2' => { 'child3' => { } } 
                     } ,
            'gp2' => {  
                        'p3' => {  'child4' => { } } ,
                        'p4'  => {  'child5'  => { } , 'child6' => { } }
                     } ,
            'gp3' => { 'p5' => { 'child7' => { } } ,
                       'p6' => { 'child8' => { } }
                     }
            }
                    } )
 
  

ruby_tree.visit_all{|i| puts i.node_name }
puts "Number of leaves: #{ruby_tree.leaves}"



  
  
