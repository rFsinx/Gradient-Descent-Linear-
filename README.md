# Gradient Descent & Multivariable Calculus Extension

## Sum of squared residuals

a quadratic function, leading coefficient > 0 $\implies$ its derivative = 0 $\Leftrightarrow$ its minimum
has convex paraboloid shape

$$
f(a, s) = \sum ((ax_i + s)-y_i)^2
$$

**Partial Derivatives**:

$$
\frac{\partial f}{\partial s} = \sum 2((ax_i + s) - y_i) \qquad \frac{\partial F}{\partial a} = \sum 2x_i((ax_i + s) - y_i)
$$

**Step SIze (using learning rate $\eta$):**

$$
s_{n+1} = s_n - \left. \frac{\partial f}{\partial s} \right |_{(a, s) = (a_n, s_n)} \cdot \eta \quad \text{and} \quad a_{n+1} = a_n - \left. \frac{\partial f}{\partial a} \right |_{(a, s) = (a_n, s_n)} \cdot \eta
$$


## 2D Gradient Application (z = f(a, s))

$\nabla F$ is a vector field (having vector outputs)

$$
\nabla f(a, s) = \frac{\partial f}{\partial a} \ \mathbf{\hat{i}} + \frac{\partial f}{\partial s} \ \mathbf{\hat{j}}
$$

**Vectorized Step Size ($\eta$):**

goal: toward vertex's coordinate on as-plane

$$
\vec{x}_n = a_n \hat{i} + s_n \hat{j} \quad \text{(on as-plane)}
$$


$$
\therefore \quad \vec{x}_{n+1} = \vec{x}_n - \eta \nabla F(a_n, s_n) \quad \Leftrightarrow \quad s_{n+1} = s_n - \left. \frac{\partial F}{\partial s} \right |_{(a, s) = (a_n, s_n)} \cdot \eta \quad \text{and} \quad a_{n+1} = a_n - \left. \frac{\partial F}{\partial a} \right |_{(a, s) = (a_n, s_n)} \cdot \eta
$$



## Project Overview
- (June 2026 - Implementation):  Expanded a previously completed AP Calculus AB project by integrating partial differentiation to upgrade a Java-based linear regression tool for highway traffic modeling.
- (October 2026 - Tools Extension): Self-studied Vector Calculus to re-analyze the optimization trajectory via 2D Gradient Field (∇f).

# Convergence & Limitations
- The algorithm requires a sufficiently small learning rate (η) to ensure convergence. On a paraboloid surface (unsure about other shapes), convergence slows significantly near the local minimum as the gradient magnitude approaches zero (||∇f|| ≈ 0), illustrating the classic vanishing gradient behavior in basic optimization
- 
# Bonus (earlier Feb 2026 version):
  - curiosity about cross product (coordinate derivation) & curl: Tried to link curl and rotation using mechanical torque.
